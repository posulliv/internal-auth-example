/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.trino.jwtgen;

import picocli.CommandLine;

@CommandLine.Command(
        name = "trino-jwt-gen-cli",
        usageHelpAutoWidth = true,
        subcommands = {
                UseInternalAuthenticationCommand.class
        }
)
public class Cli
{
    @CommandLine.Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit")
    public boolean usageHelpRequested;

    private Cli() {}

    public static CommandLine create()
    {
        return new CommandLine(new Cli());
    }

    public static void main(String[] args)
    {
        System.exit(create().execute(args));
    }
}